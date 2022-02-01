/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bse191002
 */
public class controller {
     DbConnection dbcon;
    product p;
    static int deleteid=1;
    public controller(int id)
    {
        dbcon=new DbConnection();
        deleteid=id;
    }
    public controller(String name,String description,int price)
    {
        dbcon=new DbConnection();
        p=new product(name,description,price);
    }
    public void add()
    {   //query to insert into the database 
        String query="Insert into product(name,description,price) values"+"('"+p.getName()+"','"+p.getDescription()+"','"+p.getPrice()+"')";
        dbcon.insert(query);
    }
    //function for update
    public void update()
    {
        String query="Update product set Name='"+p.getName()+"', description='"+p.getDescription()+"', price='"+p.getPrice()+"' where id='"+1+"'";
        dbcon.update(query);
    }
    public void delete()
    {
        String query="Delete from product where id='"+deleteid+"'";
        dbcon.delete(query);
    }
}
