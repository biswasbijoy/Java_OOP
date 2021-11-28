public class Student {
        
        private String name;
        private String id;
        private String dob;
        private int batch;
        
        public Student(String id, String name, int batch) {
                
                this.id = id;
                
                this.name = name;
                
                this.batch = batch;
                
        }
        
        public void setId(String id) {
                
                this.id = id;
                
        }
        
        public void setName(String name) {
                
                this.name = name;
                
        }
        
        public void setBatch(int batch) {
                
                this.batch = batch;
                
        }
        
        
        public String getId() {
                
                return id;
                
        }
        
        
        public String getName() {
                
                return name;
                
        }
        
        public int getBatch() {
                
                return batch;
                
        }
        
        public void setDob(String dob) {
                
                this.dob = dob;
                
        }
        
        public String getDob() {
                return dob;
        }
        
}