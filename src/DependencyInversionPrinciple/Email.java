package DependencyInversionPrinciple;

public class Email implements Message {

    @Override
    public void sendMessage() {sendEmail();}

    private void sendEmail() {}
}