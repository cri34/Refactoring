public Addres{
    private String street;
    private int codePostal;
    private String city;
    public Addres(String street,int codePostal,String city){
        this.street=street;
        this.codePostal=codePostal;
        this.city=city;
        }
    public String toString(){
        return " Address[city= "+city+" CodePostal= " +codePostal+" Street= " + street +"]";
        }
        }