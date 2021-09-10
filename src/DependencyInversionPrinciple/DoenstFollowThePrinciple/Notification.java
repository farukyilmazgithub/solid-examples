package DependencyInversionPrinciple.DoenstFollowThePrinciple;

public class Notification {

    private Email email = new Email();
    private SMS sms = new SMS();

    public void sender() {
        email.sendEmail();
        sms.sendSMS();
    }
}