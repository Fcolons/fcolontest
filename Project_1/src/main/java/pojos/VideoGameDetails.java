package pojos;

public class VideoGameDetails {
        private String tittle;
        private String genre;
        private String developer;
        private String editor;
        private String franchise;
        private String releaseDate;

        public String getTittle() {
            return tittle;
        }

        public void setTittle(String tittle) {
            this.tittle = tittle;
        }

        public String getGenre() {
            return genre;
        }

        public void setGenre(String genre) {
            this.genre = genre;
        }

        public String getDeveloper() {
            return developer;
        }

        public void setDeveloper(String developer) {
            this.developer = developer;
        }

        public String getEditor() {
            return editor;
        }

        public void setEditor(String editor) {
            this.editor = editor;
        }

        public String getFranchise() {
            return franchise;
        }

        public void setFranchise(String franchise) {
            this.franchise = franchise;
        }

        public String getReleaseDate() { return releaseDate; }

        public void setReleaseDate(String releaseDate) { this.releaseDate = releaseDate; }
}
