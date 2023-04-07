public class Conjuntos {

  public static void main(String[] args) {

    int conjuntoA[] = {1,2,3,7,10};
    int conjuntoB[] = {1,3,6,8,10};
    int conjuntoC[] = {2,4,7,8,9};
    int conjuntoD[] = {2,3,6,9};
    int universo[] = {1,2,3,4,5,6,7,8,9,10};

    interseccion(conjuntoA, universo);

  }
  public static void interseccion(int[] a, int[] b){
    int[] conjunto = new int[0];

    for (int i = 0; i < a.length; i++){

      for(int j = 0; j < b.length; j++){

        if(a[i] == b[j]){
          int nuevoElemento = a[i];
          int conjuntoInterseccion[] = new int[conjunto.length + 1];

          for (int k = 0;k < conjunto.length;k++){
            conjuntoInterseccion[k] = conjunto[k];
          }
          conjuntoInterseccion[conjunto.length] = nuevoElemento;

          for (int y = 0; y < conjuntoInterseccion.length; y++){
            System.out.println(conjuntoInterseccion[y]);
          }
        }
      }
    }
  }
}