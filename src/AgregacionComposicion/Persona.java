package AgregacionComposicion;


class Persona {
        private String nombre;
        private int edad;
        private Domicilio d;
        private Curso c;


        public Persona (){

        }

        public Persona (String nombre, int edad,  int NumeroCalle, String nombreCalle){
            this.nombre = nombre;
            this.edad = edad;
            this.d = new Domicilio(nombreCalle, NumeroCalle);

        }

        public void AgregarCurso (Curso c1){ this.c = c1; }

        public String getCurso (){return c.getNombre();}

        public String getDomicilio (){return d.Datos();}

        public void setDomicilio (String n, int num){ d.setNombreCalle(n); d.setNumCalle(num);}

        public String getNombre (){return nombre;}

        public void setNombre (String nombre){
            this.nombre = nombre;
        }

        public int getEdad (){return edad;}

        public void setEdad (int edad){
            this.edad = edad;
        }

        public void Caminar (int km){
            System.out.println("Caminé "+ km);
        }

        public String MostrarDatos (){

            if (c == null) {
                return "Mi nombre es " + nombre + ", tengo una edad de " + edad + " y vivo en " + d.getNombreCalle() +" " +d.getNumCalle();
            }else {
                return "Mi nombre es " + nombre + ", tengo una edad de " + edad + " y vivo en " + d.getNombreCalle() +" " +d.getNumCalle() + " y curso "+ c.getNombre();
            }
        }

    }
