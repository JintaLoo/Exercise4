class Car
{
        String model, brand, year, color;
        double price, quantity;
        public Car(String model,String brand,String year,double price,String color,double quantity)
        {
            this.model=model;
            this.brand=brand;
            this.year=year;
            this.price=price;
            this.color=color;
            this.quantity=quantity;
        }
        public String GetModel() {
            return model;
        }
        public String GetBrand() {
            return brand;
        }
        public String GetYear() {
            return year;
        }
        public String GetColor() {
            return color;
        }
        public Double GetPrice() {
            return price;
        }
        public Double GetQuantity() {
            return quantity;
        }
        public void SetModel(String md) {
            model = md;
        }
        public void SetBrand(String br) {
            brand = br;
        }
        public void SetYear(String yr) {
            year = yr;
        }
        public void SetColor(String clr) {
            color = clr;
        }
        public void SetPrice(Double pc) {
            price = pc;
        }
        public void SetQuantity(Double qt) {
            quantity = qt;
        }

        void sell(int sold)
        {quantity-=sold;}
        void delivery(int delivery)
        {quantity+=delivery;}

        public String toString()
        {
            return "Car = " +
                    "Model = " + model + ", " +
                    "Brand = " + brand + ", " +
                    "Year = " + year + ", " +
                    "Price = " + price + ", " +
                    "Color = " + color + ", " +
                    "Quantity = " + quantity ;
        }
}

public class Task2
{
    public static void main(String[] args)
    {
        Car car = new Car("GLE", "Mercedes", "2020", 35000, "white", 5);
        System.out.println(car.toString());
        System.out.println(car.GetColor());
        car.sell(1);
        car.delivery(2);
        String year=car.GetYear();
        car.SetColor("Red");
        System.out.println(car.toString());


    }
}

