import java.util.*;
public class RedCongestionControl 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the maximum number of packets:");
        int maxPackets = sc.nextInt();

        System.out.println("Enter the queue size:");
        int queueSize = sc.nextInt();

        System.out.println("Enter the maximum probability:");
        double maxProbability = sc.nextDouble();

        System.out.println("Enter the minimum probability:");
        double minProbability = sc.nextDouble();

        System.out.println("Enter the threshold value:");
        int threshold = sc.nextInt();

        simulateCongestion(maxPackets, queueSize, maxProbability, minProbability, threshold);
    }

    private static void simulateCongestion(int maxPackets, int queueSize, double maxProbability, double minProbability, int threshold) 
    {
        Random rand = new Random(System.currentTimeMillis());
        int queueLength = 0;

        for (int i = 0; i < maxPackets; i++) 
        {
            double dropProbability = calculateDropProbability(queueLength, queueSize, maxProbability, minProbability, threshold);

            if (queueLength >= threshold && rand.nextDouble() < dropProbability) 
                System.out.println("Packet dropped (CONGESTION AVOIDANCE)");

            else 
            {
                System.out.println("Packet accepted " + (i + 1));
                queueLength++;
            }

        }
    }

    private static double calculateDropProbability(int currentQueueLength, int queueSize, double maxProbability, double minProbability, int threshold) 
    {
        double slope = (maxProbability - minProbability) / (queueSize - threshold);
        return minProbability + slope * (currentQueueLength - threshold);
    }
}
