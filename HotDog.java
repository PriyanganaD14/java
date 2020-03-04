class Jack
{
    public static void main(String args[])
    {
        int totalHotDog=400;
        int packetContained=8;
        int totalPacket=0;
        int temp=totalHotDog+packetContained;
        while(temp>packetContained)
        {
            temp=temp-packetContained;
            totalPacket++;
        }
        {
            System.out.println("Total Packet did he buy : "+totalPacket);
        }
    }
}
