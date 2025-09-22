import java.util.Scanner;

public class ep01_PrimerExamenParcial {
    public static void main(String[] args) {
        // --- Declaración de Variables ---
        Scanner obj = new Scanner(System.in);
        char opc;

        // --- Constantes de Precios ---
        final double P_EST = 50.0;
        final double P_ADL = 90.0;
        final double P_SEN = 60.0;

        // --- Variables ---
        int edad, tipo, sexo, total_menores=0, total_adultos=0, total_tercera=0, total_hombres=0, total_mujeres=0, total_total=0, total_rechazados=0;
        float dinero_estudiantes = 0, dinero_adultos = 0, dinero_tercera = 0, dinero_total = 0;
        float promedio_edad;

        // --- Ciclo Principal del Programa ---
        do {
            System.out.println("---\tNUEVA VENTA\t---");

            System.out.print("\n\n\tIngresa la edad\t:\t"); edad = obj.nextInt();
            
            // Usa una estructura if/else para verificar si la edad es permitida (> 13).
                if (edad > 13) {
                    do { 
                    System.out.print("\n\tIngresa el tipo de comprador\n\t([1] Estudiante, [2] Adulto, [3] Tercera Edad):\t"); tipo = obj.nextInt();
                    } while (tipo < 1 || tipo > 3);
                    do {
                    System.out.print("\n\tIngresa el sexo\n\t([1] Hombre, [2] Mujer):\t"); sexo = obj.nextInt();
                    } while (sexo < 1 || sexo > 2);
                    System.out.println("\n\t¡Bienvenido!\n");

                    switch (tipo) {
                        case 1:
                            dinero_estudiantes += P_EST;
                            total_menores++;
                            break;
                        case 2:
                            dinero_adultos += P_ADL;
                            total_adultos++;
                            break;
                        case 3:
                            dinero_tercera += P_SEN;
                            total_tercera++;
                            break;
                        default:
                            System.out.println("Que.");
                            break;
                    }
                    switch (sexo) {
                        case 1:
                            total_hombres++;
                            break;
                        case 2:
                            total_mujeres++;
                            break;
                        default:
                            System.out.println("Que.");
                            break;
                    }
                }
            
            // Si la edad NO es permitida:
            else {
                System.out.println("\n\tNo se permiten bebes. (menores de 13 años)\n");
                total_rechazados++;
            }
            System.out.print("\n¿Desea registrar otra venta? [S/N]: ");
            opc = obj.next().toUpperCase().charAt(0);
            System.out.println("----------------------");
        } while (opc == 'S');


        // --- Cálculos y Reporte Final ---
        
        System.out.println("\n===== REPORTE FINAL DE LA FUNCIÓN =====");
        // Realiza los cálculos finales que necesites (promedio de edad, totales, etc.).
        promedio_edad = (total_menores + total_adultos + total_tercera) / 3;
        total_total = total_menores + total_adultos + total_tercera;
        dinero_total = dinero_estudiantes + dinero_adultos + dinero_tercera;
        System.out.println("--- Estadísticas del Público ---");
        System.out.println("Total Menores      :\t" + total_menores);
        System.out.println("Total Adultos      :\t" + total_adultos);
        System.out.println("Total Tercera Edad :\t" + total_tercera);
        System.out.println("Total Hombres      :\t" + total_hombres);
        System.out.println("Total Mujeres      :\t" + total_mujeres);
        System.out.println("Total Rechazados   :\t" + total_rechazados);
        System.out.println("Total General      :\t" + total_total);
        System.out.printf("Promedio de Edad\t:\t%.2f\n", promedio_edad);
        System.out.println("\n--- Reporte de Ingresos ---");
        // Imprime aquí los resultados de los acumuladores de dinero.
        System.out.printf("Recaudacion de Estudiantes   :\t$\t%.2f\n", dinero_estudiantes);
        System.out.printf("Recaudacion de Adultos       :\t$\t%.2f\n", dinero_adultos);
        System.out.printf("Recaudacion de Tercera Edad  :\t$\t%.2f\n", dinero_tercera);
        System.out.printf("Recaudacion Total            :\t$\t%.2f\n", dinero_total);
        System.out.println("\n--- Rentabilidad del Evento ---");
        if (dinero_total < 1500) {
            System.out.println("\nGanancias por debajo de\t:\t$\t1500");
            System.out.println("La funcion genero bajas :c");
        } else if (dinero_total > 1500 && dinero_total < 3500) {
            System.out.println("\nGanancias por encima de\t:\t$\t1500 pero menor de\t:\t$\t3500");
            System.out.println("La funcion genero ganancias moderadas :)");
        } else {
            System.out.println("\nGanancias por encima de\t:\t$\t3500");
            System.out.println("La funcion genero altas ganancias :D");
        }
        // --- Cierre del Programa ---
        obj.close();
    }
}

/* Preguntas teoricas, contesta con tus propias palabras, aqui mismo:

1. ¿ Qué estructura utilizaste para determinar el tipo de comprador y por que no otra estructura?
        Utilicé switch ya que se me hace mucho mas simple, además de estetico.
2. ¿ Qué tipo de dato elegiste para las variables que cuentan el tipo de público que asiste a la función y por qué fue la mejor opción?
        Utilicé int ya que es más facil de manejar y es menos tedioso el rechazar opciones invalidas.
3. ¿ Qué tipo de dato elegiste para las variables que almacenan el dinero recaudado y por qué esa fue la mejor opción?
        Float, me gusta float.
4. Si tuvieras que añadir un nuevo tipo de comprador, 'Socio del Cine', ¿Qué partes exactas de tu código necesitarías modificar?"
        Solamente tendria que añadir un nuevo case, junto a declarar las nuevas variables que implica.
 */