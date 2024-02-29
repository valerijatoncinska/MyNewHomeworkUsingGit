package MyNewHomeworkUsingGit;

public enum Dragons {
    RED("\nКрасный - самый разрушительный и агрессивный вид хроматических драконов." +
            "\nОни часто нападают на людские поселения, чтобы их захватить и пополнить свою сокровищницу." +
            "\nЧаще всего можно встретить в горах, на лугах."),

    BLUE("\nСиний - самый коварный и скрытный вид хроматических драконов.\n Они часто работают из теней, используя гуманоидных агентов,\n" +
            "бОльшая часть из которых даже не подозревает о личности их нанимателя."),

    BLACK("\nЧёрный - самый жестокий и садистский вид хроматических драконов. Они часто мучают пойманых ими существ ради своего же удовольствия.\n " +
            "Чаще всего встречаются в болотах."),
    GREEN("\nЗелёный - самый хитрый и любопытный вид хроматических драконов. Они считаются самыми добрыми из хроматических драконов.\n " +
            "Также те вечно тянутся к знаниям и могут столетия проводить в изучениях интересующих их тем.\nЧаще всего встречаются в густых лесах."),
    WHITE("\nБелый - самый зреподобный и глупий вид хроматических драконов. Они часто ведут себя сродни животным, хотя человеческий интеллект всё ещё ниже их.\n " +
            "Они крайне территориальны и нападают на всех, кто подойдёт слишком близко к их логову.\nЧаще всего встречаются в тундре, ледяной пустыне."),
    GOLD("\nЗолотой - самый мудрый и милосердный вид металлических драконов. Они редко вступают в контакт с людьми,\n" +
            "но, если это всё же происходит, те выполняют роль менторов.\n " +
            "Они больше других драконов склонны быть алчными.\nЧаще всего встречаются в горах, на лугах."),
    SILVER("\nСеребряный - самый мудрый и милосердный вид металлических драконов. Они редко вступают в контакт с людьми, но, если это всё же происходит, те выполняют роль менторов.\n " +
            "Они больше других драконов склонны быть алчными.\nЧаще всего встречаются в горах, на лугах."),
    BRONZE(),
    COPPER(),
    BRASS();

    private final String description;

    Dragons(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;

}
//class DragonDescription {
//    public static final DragonDescription RED = new DragonDescription("Красный дракон.",
//            "Самый разрушительный и агрессивный вид драконов.\n Те часто нападают на людские поселения, чтобы их захватить и пополнить свою сокровищницу.\n " +
//                    "Чаще всего можно встретить в лесах и равнинах.");
//    public static final DragonDescription BLUE = new DragonDescription("Cиний дракон.", "Самый коварный и скрытный вид драконов.\n" +
//            "Они часто работают из теней, используя гуманоидных агентов, бОльшая часть из которых даже не подозревает о личности их нанимателя." +
//            "\nЧаще всего можно встретить в пустынях, саваннах.");
//    public static final DragonDescription BLACK = new DragonDescription("Чёрный дракон", "Самый жестокий и "
//    public static final DragonDescription GREEN = new DragonDescription("Красный дракон",
//    public static final DragonDescription WHITE = new DragonDescription("Красный дракон",
//    public static final DragonDescription GOLD = new DragonDescription("Красный дракон",
//    public static final DragonDescription SILVER = new DragonDescription("Красный дракон",
//    public static final DragonDescription BRONZE = new DragonDescription("Красный дракон",
//    public static final DragonDescription COPPER = new DragonDescription("Красный дракон",
//    public static final DragonDescription BRASS = new DragonDescription("Красный дракон",
//            "Самый разрушительный и агрессивный вид драконов. Те часто нападают на людские поселения, чтобы их захватить и пополнить свою сокровищницу.");
//
//
//    private final String name;
//    private final String description;
//
//    DragonDescription(String name, String description) {
//        this.name = name;
//        this.description = description;
//    }
}
