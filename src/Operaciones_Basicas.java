public class Operaciones_Basicas {
        private float num;
        private float num2;
        public static final int SUMA=1;
        public static final int RESTA=2;
        public static final int MULTIPLICACION=3;
        public static final int DIVISION=4;
/*        public static final int RAIZ_CUADRADA=5;
        public static final int RAIZ_CUBICA=6; **/
        public static final int RAIZ=5;
        public Operaciones_Basicas(float num, float num2) {
            this.num = num;
            this.num2= num2;
        }
    /**
     *
     * @param a tipo de operacion
     * @param num primer numero para operar
     * @param num2 segundo numero para operar, en el caso RAIZ es el indice
     * @return resultado de las operaciones
     */
        public static Float operaciones(int a,float num,float num2){
            float resultado=0;
            switch (a){
                case SUMA:
                    resultado=num+num2;
                    break;
                case RESTA:
                    resultado=num-num2;
                    break;
                case MULTIPLICACION:
                    resultado=num*num2;
                    break;
                case DIVISION:
                    resultado=num/num2;
                    break;
//                case RAIZ_CUADRADA:
//                    resultado=(float) Math.sqrt(num);
//                    break;
//                case RAIZ_CUBICA:
//                    resultado=(float) Math.cbrt(num);
//                    break;
                case RAIZ:
                    resultado = (float) Math.pow(num, 1.0 / num2);
                    break;
                default:
                    System.out.println("Operacion no Valida");
            }
            return  resultado;
        }
}