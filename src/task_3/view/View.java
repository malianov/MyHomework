package task_3.view;

/**
 * This class {@code View} represents the View layer from MVC model pattern.
 * Class defines text constants used for messages preparation and the
 * methods definition, used for showing the messages.
 *
 * @author Igor Malianov
 * https://github.com/malianov/MyHomework/tree/master/src/task_3
 */

public class View {
    public static final String INVITATION           = "Please, fill in carefully the following data: ";
    public static final String SURNAME              = "Surname: ";
    public static final String NAME                 = "Name: ";
    public static final String PATRONYMIC           = "Patronymic: ";
    public static final String NICKNAME             = "Nickname: ";
    public static final String COMMENT              = "Comment: ";
    public static final String GROUP                = "User group ";
    public static final String GROUP_ADVICE         = "(HOME / WORK / UNIVERSITY / FRIENDS):";
    public static final String PHONE_HOME           = "PhoneHome ";
    public static final String PHONE_MOB            = "PhoneMob ";
    public static final String PHONE_MOB_2          = "PhoneMob_2 ";
    public static final String OR_NOT               = ", OR ` - ` ";
    public static final String PHONE_ADVICE         = "(like +38(050)353-75-92)";
    public static final String EMAIL                = "Email: ";
    public static final String SKYPE                = "Skype: ";
    public static final String ADDRESS_INDEX        = "Address_Index ";
    public static final String ADDRESS_CITY         = "Address_City ";
    public static final String ADDRESS_STREET       = "Address_Street ";
    public static final String ADDRESS_BUILDING     = "Address_building ";
    public static final String ADDRESS_APARTMENT    = "Address_apartment ";
    public static final String DATA_OF_ENTERING     = "Date when the data were entered ";
    public static final String DATA_LAST_CHANGES    = "Date when the last changes was ";
    public static final String INPUT_ERROR    = "Please, enter it corectly ";

    /**
     * The {@code showMessage} method is a static method, receives one, two or three
     * String message(-es) and print(-s) it(-s) to user.
     */
    public static void showMessage(String message) {
        System.out.println(message);
    }

    /**
     * The {@code showMessage} method receives two String messages) and print its to user.
     * Used when there are some advice exist. Deprecated.
     */
    @Deprecated
    public static void showMessage(String message, String advice) {
        System.out.println(message + advice);
    }

    /**
     * The {@code showMessage} method receives three String messages) and print its to user.
     * Used when there are some advice and additional comments exist. Deprecated.
     */
    @Deprecated
    public static void showMessage(String message, String advice, String addon) {
        System.out.println(message + advice + addon);
    }
}
