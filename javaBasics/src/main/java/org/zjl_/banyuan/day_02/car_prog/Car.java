package org.zjl_.banyuan.day_02.car_prog;

public class Car {
    //      型号    汽车名      颜色     生产日期   制造商 ;
    private String carId, carName, carColor, carBirth, producer;

    public Car() {
    }

    public Car(String carId, String carName, String carColor, String carBirth, String producer) {
        this.carId = carId;
        this.carName = carName;
        this.carColor = carColor;
        this.carBirth = carBirth;
        this.producer = producer;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public String getCarBirth() {
        return carBirth;
    }

    public void setCarBirth(String carBirth) {
        this.carBirth = carBirth;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }


    //子类对父类进行重写，用于检查是否错误；
    @Override
    //方法里面不要放输出语句；
    public String toString() {
        return "Car{" +
                "carId='" + carId + '\'' +
                ", carName='" + carName + '\'' +
                ", carColor='" + carColor + '\'' +
                ", carBirth='" + carBirth + '\'' +
                ", producer='" + producer + '\'' +
                '}';
    }
}
