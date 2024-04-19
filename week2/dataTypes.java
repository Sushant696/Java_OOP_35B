package week2;

public class dataTypes {
    public static void main(String[] args) {

        // task 1
        int variable = 22;
        if (variable > 18 ){
            System.out.println("greater than 18");
        }
        else {
            System.out.println("smaller than 18");
        }

        // task 2 
        int time = 12;
        int amount = 898;
        int rate = 10;
        double si ;

        si = time  * amount *rate /100 ;
        System.out.println(si);
// task 3
            int length= 12;
            int breadth = 898;
            int perimeter = 2*(length + breadth);
            int area = length * breadth; 
            System.out.println(area+perimeter);
// task 4
        int output = variable > 18 ? 1:-1;
        System.out.println(output);
        
    }
}
/*
 
 
wap to print wheatehr a valiabel is greate or equall to 18


task 2 
print simple interest from valiables 
make 3 variable for amount time and rate and save the calculation into formula : 

si = amount * time * rate /100

task 3 

print the area and perimeter of rectange 
area = length * breadth
perimeter = 2 9l+b0

complete the task 1 using ternary operators


*/