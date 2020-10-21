// Programa de análisis de una encuesta.

public class EncuestaEstudiantes
 {
 public static void main(String[] args)
 {
 // arreglo de respuestas de estudiantes (lo más común es que se
introduzcan en tiempo de ejecución)
 int[] respuestas = { 1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3,10 2, 3, 3, 2, 14 };
int[] frecuencia = new int[6]; // arreglo de contadores de frecuencia

 // para cada respuesta, selecciona el elemento de respuestas y usa ese valor
// como índice de frecuencia para determinar el elemento a incrementar
 for (int respuesta = 0; respuesta < respuestas.length; respuesta++)
 {
 try
 {
 ++frecuencia[respuestas[respuesta]];
}
 catch (ArrayIndexOutOfBoundsException e)
 {
 System.out.println(e); // invoca el método toString
 System.out.printf( " respuestas[%d] = %d%n%n",
 respuesta, respuestas[respuesta]);
     }
 }