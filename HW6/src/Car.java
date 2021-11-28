public enum Car {
    
        MWR("Maruti Wagon R", "4.93 Lakh"),
        TT("Tata Tiago", "4.99 Lakh"),
        RKWID("Renault KWID", "3.15 Lakh"),
        TP("Tata Punch", "5.49 Lakh"),
        MGA("MG Astor", "9.78 Lakh"),
        TN("Tata Nexon", "7.28 Lakh"),
        KS("Kia Seltos", "9.95 Lakh");
    
    
        private final String title;
        private final String price;
    
        Car(String title, String price) {
    
            this.title = title;
            this.price = price;
    
        }
    
    
        public String getTitle() {
            return title;
        }
    
        public String getPrice() {
    
            return price;
    
        }
    
    
    }
    