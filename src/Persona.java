class Persona {
    //Atributos
    private String nombre;
    private int edad;
    private float peso;
    private float estatura;

    //Contructores:
    public Persona(){
        /*
        Sirve para inicializar los valores por defecto de un objeto instanciado
         */
        this.nombre = "";
        this.edad = 0;
        this.peso = 0f; //f : Flotante
        this.estatura = 0;
    }
        /*
          Segundo Constructor:
          Sobrecarga:escribir un metodo con el mismo nombre, pero
          con diferente firma:
         */
        public Persona(String n){
            this.nombre = n;
        }

        //Tercer Constructor:
        public Persona(String n, int e){
            this.nombre = n;
            this.edad = e;
        }


    /*
        Getter y Setter
        Get : Obtener Valores
        Set : Asignar valores
     */

    //Asignamos valores con Setter:
    void setNombre(String n) {
        this.nombre = n;
    }

    //Obtenemos valores con Getter:
    String getNombre() {
        return this.nombre;
    }

    void setEdad(int e) {
        if (e < 0 || e > 150) {
            System.out.println("La edad NO es valida");
        } else {
            this.edad = e;
        }
    }

    int getEdad() {
        return this.edad;
    }
}
