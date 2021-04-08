public class App {
    public static void main(String[] args) throws Exception {

        //en este caso creo la variable local "michi"
        //de tipo Paciente
        Paciente michi = new Paciente();
        //le asigno nombre al michi
        michi.nombre = "Mabel";
        michi.especie = "gati";

        Paciente perrito = new Paciente();
        perrito.nombre = "Rubencio";
        perrito.especie = "perrito";

        ClinicaVeterinaria vete = new ClinicaVeterinaria();
        vete.nombre = "Pupis";

        //llamo a los metodos de ingresarlos a la veterinaria.
        vete.ingresar(michi);
        vete.ingresar(perrito);

        vete.imprimirListadoPacientes();



    }
}

