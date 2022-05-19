class Principal {
    public static void main(String[] args) {
        //Creamos una instancia de la Clase Persona
        Persona persona = new Persona();
        Persona otrapersona = new Persona("Jose Manuel");
        Persona tercera = new Persona("Patricia Mesias", 20);

        //Accedemos a sus Atributos:
//        persona.nombre = "Jose Valenzuela";
//        persona.edad = -45;
//        persona.peso = 90f;
//        persona.estatura = 1.7f;
        persona.setNombre("Jose Valenzuela");
        persona.setEdad(-14);

        //Mostramos ese objeto por consoloa:
//        System.out.println("Nombre : " + persona.nombre);
//        System.out.println("Edad : " + persona.edad);
//        System.out.println("Peso : " + persona.peso);
//        System.out.println("Estatura : " + persona.estatura);
        System.out.println("Nombre : " + persona.getNombre());
        System.out.println("Edad : " + persona.getEdad());
        System.out.println("Nombre de la otra persona : " + otrapersona.getNombre());
        System.out.println("Nombre de tercera : " + tercera.getNombre());
        System.out.println("Edad de tercera : " + tercera.getEdad());
    }
}
