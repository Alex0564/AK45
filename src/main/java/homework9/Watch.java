package homework9;

public class Watch {
        private String model;
        private String brand;
        private int price;

    public Watch(String model, String brand){
        this.model = model;
        this.brand = brand;
    }
    public Watch(){}

        public void setBrand(String brand){
            this.brand = brand;
        }
        public void setModel(String model){
            this.model = model;
        }
        public void setPrice(int price){
            this.price = price;
        }
        public void printInfo(){
            System.out.println("Watch{" +
                    "model='" + model + '\'' +
                    ", brand ='" + brand + '\'' +
                    ", price=" + price +
                    '}');
        }
    }

