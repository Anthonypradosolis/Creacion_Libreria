
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    /**
     *
     * @param args escribimos los valores, y luego visualizamos el resultado
     */
    public static void main(String[] args) {
        Float retorno = Operaciones_Basicas.operaciones(Operaciones_Basicas.RAIZ,5,5);
        if(retorno == null)
            System.out.println("Algo fallo");
        else
            System.out.println("El resultado es: "+retorno);
    }
}