public class Main {
    public static void main(String[] args) {
        int[][] botoes = new int[2][3];
        int[][] camisas = new int[3][2];
        int[][] resultado = new int[2][2];

        inicializarMatrizes (botoes,camisas);
        System.out.println("Botoes:");
        mostrarMatriz(botoes);
        System.out.println("Camisas:");
        mostrarMatriz(camisas);
        resultado = multiplicarMatrizes(botoes,camisas);
        System.out.println("Resultado");
        mostrarMatriz(resultado);
    }

    public static void inicializarMatrizes (int[][] botoes, int[][] camisas){
        botoes[0][0]=3;
        botoes[0][1]=1;
        botoes[0][2]=3;
        botoes[1][0]=6;
        botoes[1][1]=5;
        botoes[1][2]=5;

        camisas[0][0]=100;
        camisas[0][1]=50;
        camisas[1][0]=50;
        camisas[1][1]=100;
        camisas[2][0]=50;
        camisas[2][1]=50;
    }

    public static void mostrarMatriz (int[][] matriz){
        for (int i = 0; i< matriz.length;i++){
            for (int j = 0; j< matriz[i].length;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
    }


    public static void calcularMultiplicacao (int[][] matriz1, int[][] matriz2, int[][] resultado){
        for (int i =0; i < matriz1.length; i++){
            for (int j =0; j < matriz2[i].length; j++){
                int valor = 0;
                for (int k = 0; k < matriz1.length; k++){
                    valor += matriz1[i][k] * matriz2[k][j];
                }
                resultado[i][j] = valor;
            }
        }
    }

    public static int[][] multiplicarMatrizes(int[][] matriz1, int[][] matriz2) {
        int linhasMatriz1 = matriz1.length;
        int colunasMatriz1 = matriz1[0].length;
        int colunasMatriz2 = matriz2[0].length;

        int[][] resultado = new int[linhasMatriz1][colunasMatriz2];

        for (int i = 0; i < linhasMatriz1; i++) {
            for (int j = 0; j < colunasMatriz2; j++) {
                int valor = 0;
                for (int k = 0; k < colunasMatriz1; k++) {
                    valor += matriz1[i][k] * matriz2[k][j];
                }
                resultado[i][j] = valor;
            }
        }

        return resultado;
    }
}