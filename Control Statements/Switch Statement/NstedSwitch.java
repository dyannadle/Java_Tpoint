public class NstedSwitch {
    public static void main(String[] args) {
    char branch = 'C';
    int collegeYear = 3;    
    switch(collegeYear){
    case 1: 
        System.out.println("English, Maths, Science"); 
        break;
    case 2:
        System.out.println("English, Maths, Science, Java, Data Structure"); 
        break;
    case 3:
        switch(branch){
        case 'C':
            System.out.println("Operating System, Computer Networks, DBMS, Java");
            break;
        case 'E':
            System.out.println("Microprocessors, Logic Switching Theory, Circuit Analysis, Java");
            break;
        case 'M':
            System.out.println("Thermodynamics, Fluid Mechanics, Heat Transfer, Java");
            break;
        }
        break;
    case 4:

        switch(branch){
        case 'C':
            System.out.println("Data Mining, Machine Learning, AI, Big Data");
            break;
        case 'E':
            System.out.println("Embedded System, Image Processing, Signal Processing, IoT");
            break;
        case 'M':
            System.out.println("Production Technology, Thermal Engineering, Refrigeration and Air Conditioning, IoT");
            break;
        }
        break;
    default:
        System.out.println("Invalid College Year");
        break;
    }
}
}