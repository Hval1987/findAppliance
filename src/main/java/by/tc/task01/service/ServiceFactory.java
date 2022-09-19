package by.tc.task01.service;

public class ServiceFactory {

   private  static ServiceFactory instance=new ServiceFactory();
   private ApplianceServise service=new OvenServiceImplements();



    private ServiceFactory() {
    }
    public ServiceFactory getInstance(){
        return instance;
    }
    public ApplianceServise getOvenService(){
        return service;
    }


}
