package DependencyInversionPrinciple;

public class SMS implements Message {

    @Override
    public void sendMessage() {sendSMS();}

    private void sendSMS() {}
}