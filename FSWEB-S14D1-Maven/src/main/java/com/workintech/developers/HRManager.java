package com.workintech.developers;

public class HRManager extends Employee{

    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(long id,String name,double salary){
        super(id,name,salary);
        juniorDevelopers = new JuniorDeveloper[5];
        midDevelopers = new MidDeveloper[5];
        seniorDevelopers = new SeniorDeveloper[5];
    }

    @Override
    public void work() {
        System.out.println("HRManager starts to working");
        setSalary(getSalary()+4000);
    }

    public void addEmployee(JuniorDeveloper dev) {
        for(int i=0;i<juniorDevelopers.length;i++){
            if(juniorDevelopers[i]==null){
                juniorDevelopers[i]=dev;
                return;
            }
        }
        System.out.println("junior Developers arrayinde yer kalmamıştır.");
    }

    public void addEmployee(MidDeveloper dev) {
        for(int i=0;i<midDevelopers.length;i++){
            if(midDevelopers[i]==null){
                midDevelopers[i]=dev;
                return;
            }
        }
        System.out.println("Mid Developer arrayinde yer kalmamıştır.");
    }

    public void addEmployee(SeniorDeveloper dev) {
        for(int i=0;i<seniorDevelopers.length;i++){
            if(seniorDevelopers[i]==null){
                seniorDevelopers[i]=dev;
                return;
            }
        }
        System.out.println("Senior Developer arrayinde yer kalmamıştır.");
    }
}
