package data;

import java.util.Objects;

public class VideoGameDetails {
        private String titulo;
        private String genero;
        private String desarrollador;
        private String editor;
        private String franquicia;
        private String fechaLanzamiento;

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public String getGenero() {
            return genero;
        }

        public void setGenero(String genero) {
            this.genero = genero;
        }

        public String getDesarrollador() {
            return desarrollador;
        }

        public void setDesarrollador(String desarrollador) {
            this.desarrollador = desarrollador;
        }

        public String getEditor() {
            return editor;
        }

        public void setEditor(String editor) {
            this.editor = editor;
        }


    public String getFranquicia() {
            return franquicia;
        }

        public void setFranquicia(String franquicia) {
            this.franquicia = franquicia;
        }

    public String getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(String fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VideoGameDetails that = (VideoGameDetails) o;
        return titulo.equals(that.titulo) &&
                genero.equals(that.genero) &&
                desarrollador.equals(that.desarrollador) &&
                editor.equals(that.editor) &&
                franquicia.equals(that.franquicia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, genero, desarrollador, editor, franquicia);
    }
}
