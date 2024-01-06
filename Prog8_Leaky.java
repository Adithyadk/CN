import java.util.Scanner;
public class Leaky 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);

        int bucket_remaining = 0, sent, received;
        int[] buf = new int[30]; 

        System.out.println("Enter the bucket capacity");
        int bucket_capacity = sc.nextInt();

        System.out.println("Enter the bucket rate (Rate at which the bucket sends the packets)");
        int bucket_rate = sc.nextInt();

        System.out.println("Enter the number of packets to be sent");
        int n = sc.nextInt();

        System.out.println("Enter the packets sizes one by one");
        for (int i = 0; i < n; i++) 
            buf[i] = sc.nextInt();

        System.out.printf("Time\tP_size\taccepted\tsent\tremaining\n");

        for (int i = 0; i < n; i++) 
        {
            if (buf[i] != 0) 
            {
                if (bucket_remaining + buf[i] > bucket_capacity) 
                    received = -1;

                else
                {
                    received = buf[i];
                    bucket_remaining += buf[i];
                }

            } 
            else
                received = 0;

            if (bucket_remaining != 0) 
            {
                if (bucket_remaining < bucket_rate) 
                {
                    sent = bucket_remaining;
                    bucket_remaining = 0;
                } 

                else 
                {
                    sent = bucket_rate;
                    bucket_remaining -= bucket_rate;
                }

            } 
            else 
                sent = 0;

            if (received == -1) 
                System.out.printf("%d\t%d\t%s\t%d\t%d\n", i + 1, buf[i], "dropped", sent, bucket_remaining);
            else 
                System.out.printf("%d\t%d\t%d\t%d\t%d\n", i + 1, buf[i],received, sent, bucket_remaining);

        }
    }
}
