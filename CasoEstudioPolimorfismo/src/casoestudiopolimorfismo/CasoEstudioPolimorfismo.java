/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package casoestudiopolimorfismo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author JAIRO F
 */
public class CasoEstudioPolimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Empleado> e = new ArrayList();

        e = new ArrayList<>();

        ArrayList<PorPagar> cp = new ArrayList();

        cp = new ArrayList<>();

        Scanner tec = new Scanner(System.in);
        boolean seg = true;
        int op;

        while (seg) {
            System.out.println("/////menu/////");

            System.out.println("1. crear empleado asalariado");

            System.out.println("2. crear empleado por hora");
            System.out.println("3. crear empleado comision");
            System.out.println("4. crear empleado base mas comision");
            System.out.println("5. factura");
            System.out.println("6. nomina");
            System.out.println("7. cuentas por pagar");
            System.out.println("8. salir");
            op = tec.nextInt();
            switch (op) {
                case 1:

                    System.out.println("agregar  NOMNBRE empleado asalariado");

                    EmpleadoAsalariado emp;
                    emp = new EmpleadoAsalariado();
                    System.out.println("nombre");
                    emp.setNombre(tec.next());
                    System.out.println("apellido");
                    emp.setApellido(tec.next());
                    System.out.println("cdula");
                    emp.setCedula(tec.next());
                    System.out.println("ingresos");

                    emp.setSalarioSemanal(tec.nextDouble());
                    e.add(emp);
                    cp.add(emp);

                    break;

                case 2:

                    System.out.println("agregar  NOMNBRE empleado por horas");
                    EmpleadoPorHora emph;
                    emph = new EmpleadoPorHora();
                    System.out.println("nombre");
                    emph.setNombre(tec.next());
                    System.out.println("apellido");
                    emph.setApellido(tec.next());
                    System.out.println("cedula");
                    emph.setCedula(tec.next());
                    System.out.println("horas de trabajo");
                    emph.setnHoras(tec.nextInt());
                    System.out.println("valor de las horas");
                    emph.setValorHora(tec.nextDouble());
                    System.out.println("porcentaje");
                    emph.setpRecExtra(tec.nextDouble());
                    e.add(emph);
                    cp.add(emph);
                    break;

                case 3:
                    System.out.println("crear empleado por comision");
                    EmpleadoPorComision empc;
                    empc = new EmpleadoPorComision();

                    System.out.println("nombre");
                    empc.setNombre(tec.next());
                    System.out.println("apellido");
                    empc.setApellido(tec.next());
                    System.out.println("cedula");
                    empc.setCedula(tec.next());
                    System.out.println("total de ventas");
                    empc.setTotalVentas(tec.nextDouble());
                    System.out.println("tarifa de comision");
                    empc.setTarifaComision(tec.nextDouble());
                    e.add(empc);
                    cp.add(empc);

                    break;

                case 4:
                    System.out.println("crear empelado base mas comision");
                    EmpleadoBaseMasComision empbc;
                    empbc = new EmpleadoBaseMasComision();
                    System.out.println("nombre");
                    empbc.setNombre(tec.next());
                    System.out.println("apellido");
                    empbc.setApellido(tec.next());
                    System.out.println("cedula");
                    empbc.setCedula(tec.next());
                    System.out.println("sueldo base");
                    empbc.setBase(tec.nextDouble());
                    System.out.println("total de ventas");
                    empbc.setTotalVentas(tec.nextDouble());
                    System.out.println("tarifa de comision");
                    empbc.setTarifaComision(tec.nextDouble());
                    e.add(empbc);
                    cp.add(empbc);

                    break;

                case 5:
                    System.out.println("factura");
                    Factura fact;
                    fact = new Factura();
                    System.out.println("numero de pieza");
                    fact.setNumeropieza(tec.next());
                    System.out.println("descripcion de la pieza");
                    fact.setDescripciopieza(tec.next());
                    System.out.println("cantidad");
                    fact.setCantidad(tec.nextInt());
                    System.out.println("valor articulo");
                    fact.setPrecioarticulo(tec.nextDouble());
                    cp.add(fact);

                    break;

                case 6:
                    
                   ;
                    System.out.println("nomina");
                    for (Empleado empleado : e) {

                        empleado.ingresos();
                        empleado.display();

                    }
                    break;

                case 7:
                    System.out.println("cuentas por pagar");
                    for (PorPagar p : cp) {
                        p.display();
                        System.out.println("por pagar:  " + p.obtenerMontoPago());
                        System.out.println("---------------------------------------\n");

                    }
                    break;
                case 8:
                    seg = false;
                    break;
                default:
                    System.out.println("OPCION NO VALIDA...");
                    break;
            }
        }

    }

}
