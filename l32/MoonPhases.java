package MyNewHomeworkUsingGit.l32;

import java.util.Scanner;

public enum MoonPhases {

    NEW_MOON("NEW_MOON", "\uD83C\uDF11"),
    WAXING_CRESCENT("WAXING_CRESCENT", "\uD83C\uDF12"),
    FIRST_QUARTER("FIRST_QUARTER", "\uD83C\uDF13"),
    WAXING_GIBBOUS("WAXING_GIBBOUS", "\uD83C\uDF14"),
    FULL_MOON("FULL_MOON", "\uD83C\uDF15"),
    WANING_GIBBOUS("WANING_GIBBOUS", "\uD83C\uDF16"),
    LAST_QUARTER("LAST_QUARTER", "\uD83C\uDF17"),
    WANING_CRESCENT("WANING_CRESCENT", "\uD83C\uDF18");

    private final String name;
    private final String emote;

    MoonPhases(String name, String emote) {
        this.name = name;
        this.emote = emote;
    }

    public String getName() {
        return name;
    }

    public String getEmote() {
        return emote;
    }
}

class Main2 {
    public static void main(String[] args) {

        System.out.println("Выберите фазу луны для перевода и обозначения её в процентном соотношении:");

        for (MoonPhases moon : MoonPhases.values()) {
            System.out.println(moon.getName() + moon.getEmote());
        }

        Scanner scanner = new Scanner(System.in);
        String moonPhase = scanner.nextLine();
        MoonPhases Phase = MoonPhases.valueOf(moonPhase);

        switch (Phase) {
            case NEW_MOON:
                System.out.println("Новолуние, 0%");
                break;
            case WAXING_CRESCENT:
                System.out.println("Молодая Луна, 15%");
                break;
            case FIRST_QUARTER:
                System.out.println("Первая Четверть, 50%");
                break;
            case WAXING_GIBBOUS:
                System.out.println("Растущая Луна, 75%");
                break;
            case FULL_MOON:
                System.out.println("Полнолуние, 100%");
                break;
            case WANING_GIBBOUS:
                System.out.println("Убывающая Луна, 75%");
                break;
            case LAST_QUARTER:
                System.out.println("Последняя Четверть, 50%");
                break;
            case WANING_CRESCENT:
                System.out.println("Старая Луна, 15%");
                break;

        }

    }


}
