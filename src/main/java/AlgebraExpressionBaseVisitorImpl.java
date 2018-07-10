import lmath.data.Matrix;
import lmath.data.impl.MatrixImpl;
import lmath.util.MatrixUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AlgebraExpressionBaseVisitorImpl extends AlgebraExpressionBaseVisitor<Double> {

    private HashMap<String, Double> variables = new HashMap<>();
    private ArrayList<double[][]> matrixes = new ArrayList<>();

    @Override
    public Double visitSettingVariable(AlgebraExpressionParser.SettingVariableContext ctx) {
        Double value = visit(ctx.expression());
        variables.put(ctx.VARIABLE().getText(), value);
        return value;
    }

    @Override
    public Double visitPlus(AlgebraExpressionParser.PlusContext ctx) {
        return visit(ctx.expression()) + visit(ctx.multiplicationOrDivision());
    }

    @Override
    public Double visitMinus(AlgebraExpressionParser.MinusContext ctx) {
        return visit(ctx.expression()) - visit(ctx.multiplicationOrDivision());
    }

    @Override
    public Double visitMultiplication(AlgebraExpressionParser.MultiplicationContext ctx) {
        return visit(ctx.multiplicationOrDivision()) * visit(ctx.pow());
    }

    @Override
    public Double visitDivision(AlgebraExpressionParser.DivisionContext ctx) {
        return visit(ctx.multiplicationOrDivision()) / visit(ctx.pow());
    }

    @Override
    public Double visitPower(AlgebraExpressionParser.PowerContext ctx) {
        if (ctx.pow() != null) {
            return Math.pow(visit(ctx.signAtom()), visit((ctx.pow())));
        }
        return visit(ctx.signAtom());
    }

    @Override
    public Double visitChangeSign(AlgebraExpressionParser.ChangeSignContext ctx) {
        return -1 * visit((ctx.signAtom()));
    }

    @Override
    public Double visitNumber(AlgebraExpressionParser.NumberContext ctx) {
        return Double.parseDouble(ctx.NUMBER().getText());
    }

    @Override
    public Double visitConstantPI(AlgebraExpressionParser.ConstantPIContext ctx) {
        return Math.PI;
    }

    @Override
    public Double visitConstantE(AlgebraExpressionParser.ConstantEContext ctx) {
        return Math.E;
    }

    @Override
    public Double visitVariable(AlgebraExpressionParser.VariableContext ctx) {
        return variables.get(ctx.VARIABLE().getText());
    }

    @Override
    public Double visitBraces(AlgebraExpressionParser.BracesContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public Double visitCosinus(AlgebraExpressionParser.CosinusContext ctx) {
        return Math.cos(Math.toRadians(visit(ctx.expression())));
    }

    @Override
    public Double visitCotangens(AlgebraExpressionParser.CotangensContext ctx) {
        return 1 / Math.tan(Math.toRadians(visit(ctx.expression())));
    }

    @Override
    public Double visitTangens(AlgebraExpressionParser.TangensContext ctx) {
        return Math.tan(Math.toRadians(visit(ctx.expression())));
    }

    @Override
    public Double visitSinus(AlgebraExpressionParser.SinusContext ctx) {
        return Math.sin(Math.toRadians(visit(ctx.expression())));
    }

    @Override
    public Double visitArcusCosinus(AlgebraExpressionParser.ArcusCosinusContext ctx) {
        return (180 / Math.PI) * Math.acos(visit(ctx.expression()));
    }

    @Override
    public Double visitArcusCotangens(AlgebraExpressionParser.ArcusCotangensContext ctx) {
        return (180 / Math.PI) * (Math.atan(1 / visit(ctx.expression())));
    }

    @Override
    public Double visitArcusTangens(AlgebraExpressionParser.ArcusTangensContext ctx) {
        return (180 / Math.PI) * Math.atan(visit(ctx.expression()));
    }

    @Override
    public Double visitArcusSinus(AlgebraExpressionParser.ArcusSinusContext ctx) {
        return (180 / Math.PI) * Math.asin(visit(ctx.expression()));
    }

    @Override
    public Double visitLogarithm(AlgebraExpressionParser.LogarithmContext ctx) {
        return Math.log10(visit(ctx.expression()));
    }

    @Override
    public Double visitNaturalLogarithm(AlgebraExpressionParser.NaturalLogarithmContext ctx) {
        return Math.log(visit(ctx.expression()));
    }

    @Override
    public Double visitSquareRoot(AlgebraExpressionParser.SquareRootContext ctx) {
        return Math.sqrt(visit(ctx.expression()));
    }

    @Override
    public Double visitMatrixPlus(AlgebraExpressionParser.MatrixPlusContext ctx) {

        try {
            double[][] matrix1;
            double[][] matrix2;
            if (matrixes.isEmpty()) {
                matrix1 = generateMatrix(ctx.multiplicationOrDivision().getText());
                matrix2 = generateMatrix(ctx.matrixdef().getText());
                if (matrix1 == null || matrix2 == null) {
                    System.out.println("Błąd.Wprowadź macierz");
                    System.exit(0);
                }
            } else {
                if (matrixes.size() < 2) {
                    System.out.println("Błąd.Wprowadź macierz");
                    System.exit(0);
                }
                matrix1 = matrixes.get(0);
                matrix2 = matrixes.get(1);
            }

            int m = matrix1.length;
            int n = matrix1[0].length;

            if (m != matrix2.length || n != matrix2[0].length) {
                System.out.println("Nie można dodawać macierzy o róznych wymiarach");
                System.exit(0);
            }

            double[][] matrixResult = new double[m][n];

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    matrixResult[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }

            System.out.println("Wynik dodawania macierzy");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("[");
            for (int i = 0; i < matrixResult.length; i++) {
                for (int j = 0; j < matrixResult[i].length; j++) {
                    stringBuilder.append(matrixResult[i][j]);
                    if (j < matrixResult[i].length - 1) stringBuilder.append(",");
                }
                stringBuilder.append(";");
                if (i < matrixResult.length - 1) stringBuilder.append("\n");
            }
            stringBuilder.append("]");
            System.out.println(stringBuilder);
        } catch (NumberFormatException e) {
            System.out.println("Błąd.Wprowadź macierz");
            System.exit(0);
        }

        return null;
    }

    @Override
    public Double visitMatrixMinus(AlgebraExpressionParser.MatrixMinusContext ctx) {

        try {
            double[][] matrix1;
            double[][] matrix2;
            if (matrixes.isEmpty()) {
                matrix1 = generateMatrix(ctx.multiplicationOrDivision().getText());
                matrix2 = generateMatrix(ctx.matrixdef().getText());
                if (matrix1 == null || matrix2 == null) {
                    System.out.println("Błąd.Wprowadź macierz");
                    System.exit(0);
                }
            } else {
                if (matrixes.size() < 2) {
                    System.out.println("Błąd.Wprowadź macierz");
                    System.exit(0);
                }
                matrix1 = matrixes.get(0);
                matrix2 = matrixes.get(1);
            }

            int m = matrix1.length;
            int n = matrix1[0].length;

            if (m != matrix2.length || n != matrix2[0].length) {
                System.out.println("Nie można odejmować macierzy o róznych wymiarach");
                System.exit(0);
            }

            double[][] matrixResult = new double[m][n];

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    matrixResult[i][j] = matrix1[i][j] - matrix2[i][j];
                }
            }

            System.out.println("Wynik odejmowania macierzy");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("[");
            for (int i = 0; i < matrixResult.length; i++) {
                for (int j = 0; j < matrixResult[i].length; j++) {
                    stringBuilder.append(matrixResult[i][j]);
                    if (j < matrixResult[i].length - 1) stringBuilder.append(",");
                }
                stringBuilder.append(";");
                if (i < matrixResult.length - 1) stringBuilder.append("\n");
            }
            stringBuilder.append("]");
            System.out.println(stringBuilder);
        } catch (NumberFormatException e) {
            System.out.println("Błąd.Wprowadź macierz");
            System.exit(0);
        }

        return null;
    }

    @Override
    public Double visitMatrixMultiplication(AlgebraExpressionParser.MatrixMultiplicationContext ctx) {

        try {
            double[][] matrix1;
            double[][] matrix2;

            if (matrixes.isEmpty()) {
                matrix1 = generateMatrix(ctx.multiplicationOrDivision().getText());
                matrix2 = generateMatrix(ctx.matrixdef().getText());
                if (matrix1 == null || matrix2 == null) {
                    System.out.println("Błąd.Wprowadź macierz");
                    System.exit(0);
                }
            } else {
                if (matrixes.size() < 2) {
                    System.out.println("Błąd.Wprowadź macierz");
                    System.exit(0);
                }
                matrix1 = matrixes.get(0);
                matrix2 = matrixes.get(1);
            }

            int m1 = matrix1.length;
            int n1 = matrix1[0].length;
            int m2 = matrix2.length;
            int n2 = matrix2[0].length;

            if (n1 != m2) {
                System.out.println("Nie da sie wykonać operacji mnożenia macierzy." +
                        " Macierz b musi mieć liczbę wierszy równą liczbie kolumn macierzy a.");
                return null;
            }

            double[][] c = new double[m1][n2];

            for (int i = 0; i < m1; i++) {
                for (int j = 0; j < n2; j++) {
                    for (int k = 0; k < n1; k++) {
                        c[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }

            System.out.println("Wynik mnożenia macierzy");
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < c.length; i++) {
                for (int j = 0; j < c[i].length; j++) {
                    if (j == 0) stringBuilder.append("|");
                    stringBuilder.append(c[i][j]);
                    if (j < c[i].length - 1) stringBuilder.append(" ");
                }
                stringBuilder.append("|");
                if (i < c.length - 1) stringBuilder.append("\n");
            }
            System.out.println(stringBuilder);
        } catch (NumberFormatException e) {
            System.out.println("Błąd.Wprowadź macierz");
            System.exit(0);
        }
        return null;
    }

    @Override
    public Double visitMatrix(AlgebraExpressionParser.MatrixContext ctx) {

        String input = ctx.matrixrows().getText();

        List<String[]> multiDimArray = new ArrayList<String[]>();

        String[] parts = input.replaceAll("\\[|\\]", "").split(";");

        for (String s : parts) {
            multiDimArray.add(s.split(","));
        }
        String[][] result = multiDimArray.toArray(new String[multiDimArray.size()][]);
        if (result.length > 1) {
            for (int i = 0; i < result.length; i++) {
                if (result[0].length != result[i].length) {
                    System.out.println("Niepoprawny format macierzy. " +
                            "Liczba kolumn w każdym wierszu macierzy musi być taka sama.");
                    System.exit(0);
                }
            }
        }

        try{
            double[][] matrix = new double[result.length][result[0].length];
            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < result[i].length; j++) {
                    matrix[i][j] = Double.parseDouble(result[i][j]);
                }
            }
            matrixes.add(matrix);
        }catch (NumberFormatException e){
            System.out.println("Niepoprawny format macierzy. Macierz może zawierać tylko liczby");
            System.exit(0);
        }

        return super.visitMatrix(ctx);
    }

    @Override
    public Double visitMatrixTransp(AlgebraExpressionParser.MatrixTranspContext ctx) {

        try {
            double[][] macierz;
            if (matrixes.isEmpty()) {
                macierz = generateMatrix(ctx.multiplicationOrDivision().getText());
            } else macierz = matrixes.get(0);
            if (macierz == null) {
                System.out.println("Nie da się transponować podanego wyrażenia.Wprowadź macierz");
                System.exit(0);
            }
            double[][] macierzTransponowana = new double[macierz[0].length][macierz.length];
            for (int i = 0; i < macierz.length; i++) {
                for (int j = 0; j < macierz[0].length; j++) {
                    macierzTransponowana[j][i] = macierz[i][j];
                }
            }

            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < macierzTransponowana.length; i++) {
                for (int j = 0; j < macierzTransponowana[i].length; j++) {
                    if (j == 0) stringBuilder.append("|");
                    stringBuilder.append(macierzTransponowana[i][j]);
                    if (j < macierzTransponowana[i].length - 1) stringBuilder.append(" ");
                }
                stringBuilder.append("|");
                if (i < macierzTransponowana.length - 1) stringBuilder.append("\n");
            }
            System.out.println(stringBuilder);
        } catch (NumberFormatException e) {
            System.out.println("Nie da się transponować podanego wyrażenia.Wprowadź macierz");
            System.exit(0);
        }
        return null;
    }

    @Override
    public Double visitMatrixInverse(AlgebraExpressionParser.MatrixInverseContext ctx) {

        try {
            double[][] macierz;
            if (matrixes.isEmpty()) {
                macierz = generateMatrix(ctx.multiplicationOrDivision().getText());
            } else macierz = matrixes.get(0);
            if (macierz == null) {
                System.out.println("Nie da się odwrócić podanego wyrażenia.Wprowadź macierz");
                System.exit(0);
            }
            Matrix a = new MatrixImpl(macierz);

            try {
                Matrix invert = MatrixUtils.invert(a);

                int m = invert.getRowNumber();
                int n = invert.getColumnNumber();

                StringBuilder stringBuilder = new StringBuilder();
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                        if (j == 0) stringBuilder.append("|");
                        stringBuilder.append(invert.getCell(i, j).getReal());
                        if (j < n - 1) stringBuilder.append(" ");
                    }
                    stringBuilder.append("|");
                    if (i < m - 1) stringBuilder.append("\n");
                }
                System.out.println(stringBuilder);
                return null;
            } catch (Exception e) {
                System.out.println("Nie da się wyznaczyć macierzy odwrotnej dla podanej macierzy.");
            }
        } catch (NumberFormatException e){
            System.out.println("Nie da się odwrócić podanego wyrażenia.Wprowadź macierz");
            System.exit(0);
        }

        return null;
    }

    @Override
    public Double visitMatrixScalar(AlgebraExpressionParser.MatrixScalarContext ctx) {

        try {
            double[][] macierz;

            if (matrixes.isEmpty()) {
                macierz = generateMatrix(ctx.matrixdef().getText());
            } else macierz = matrixes.get(0);
            if (macierz == null) {
                System.out.println("Nie da się wymnożyć podanego wyrażenia.Wprowadź macierz");
                System.exit(0);
            }

            double skalar = Double.parseDouble(ctx.multiplicationOrDivision().getText());

            for (int i = 0; i < macierz.length; i++) {
                for (int j = 0; j < macierz[0].length; j++) {
                    macierz[i][j] = macierz[i][j] * skalar;
                }
            }

            System.out.println("Wynik mnożenia macierzy przez skalar");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("[");
            for (int i = 0; i < macierz.length; i++) {
                for (int j = 0; j < macierz[i].length; j++) {
                    stringBuilder.append(macierz[i][j]);
                    if (j < macierz[i].length - 1) stringBuilder.append(",");
                }
                stringBuilder.append(";");
                if (i < macierz.length - 1) stringBuilder.append("\n");
            }
            stringBuilder.append("]");
            System.out.println(stringBuilder);
        } catch (NumberFormatException e) {
            System.out.println("Nie da się wymnożyć podanego wyrażenia.Wprowadź macierz");
        }
        return null;
    }

    @Override
    public Double visitCalculate(AlgebraExpressionParser.CalculateContext ctx) {
        return visit(ctx.expression());
    }

    public double[][] generateMatrix(String input) {

        if (input.charAt(0) != '[') return null;

        List<String[]> multiDimArray = new ArrayList<String[]>();
        String[] parts = input.replaceAll("\\[|\\]", "").split(";");

        for (String s : parts) {
            multiDimArray.add(s.split(","));
        }

        String[][] result = multiDimArray.toArray(new String[multiDimArray.size()][]);
        if (result.length > 1) {
            for (int i = 0; i < result.length; i++) {
                if (result[0].length != result[i].length) {
                    System.out.println("Niepoprawny format macierzy. " +
                            "Liczba kolumn w każdym wierszu macierzy musi być taka sama.");
                    System.exit(0);
                }
            }
        }

        double[][] matrix = new double[result.length][result[0].length];
        try{
            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < result[i].length; j++) {
                    matrix[i][j] = Double.parseDouble(result[i][j]);
                }
            }

        }catch (NumberFormatException e){
            System.out.println("Niepoprawny format macierzy. Macierz może zawierać tylko liczby");
            System.exit(0);
        }

        return matrix;
    }
}
