import java.util.*;
public class Token_bucket
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int token_requested=0,token_sent=0,token_remaining=0;

        System.out.println("Enter the bucket capacity");
        int bucket_capacity=sc.nextInt();

        System.out.println("Enter the Token generation rate (Rate at which tokens are sent to the bucket)");
        int token_gen_rate=sc.nextInt();

        System.out.println("Enter the number of Cycles the host computer sends the Tokens to the bucket(at constant rate)");
        int n=sc.nextInt();

        System.out.printf("Time\tTokens Requested\tTokens Sent\tTokens Remaining in bucket\n");

        for(int i=0;i<n;i++)
        {
            token_requested=token_gen_rate;

            if(token_requested+token_remaining>bucket_capacity)
            {
                token_sent=bucket_capacity-token_remaining;
                token_remaining=bucket_capacity;
            }

            else
            {
                token_sent=token_requested;
                token_remaining+=token_requested;
            }

            System.out.printf("%d\t%d\t%d\t%d\n", i + 1, token_requested, token_sent, token_remaining);
        }
    }
}
