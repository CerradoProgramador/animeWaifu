package br.com.animeWaifu.model;

public enum Emocoes {
    ANGRY("Angry"),
    BAKA("Baka"),
    BITE("Bite"),
    BLUSH("Blush"),
    BONK("Bonk"),
    BORED("Bored"),
    BULLY("Bully"),
    BYE("Bye"),
    CHASE("Chase"),
    CHEER("Cheer"),
    CRINGE("Cringe"),
    CRY("Cry"),
    CUDDLE("Cuddle"),
    DAB("Dab"),
    DANCE("Dance"),
    DIE("Die"),
    DISGUST("Disgust"),
    FACEPALM("Facepalm"),
    FEED("Feed"),
    GLOMP("Glomp"),
    HAPPY("Happy"),
    HI("Hi"),
    HIGHFIVE("Highfive"),
    HOLD("Hold"),
    HUG("Hug"),
    KICK("Kick"),
    KILL("Kill"),
    KISS("Kiss"),
    LAUGH("Laugh"),
    LICK("Lick"),
    LOVE("Love"),
    LURK("Lurk"),
    MIDFING("Midfing"),
    NERVOUS("Nervous"),
    NOM("Nom"),
    NOPE("Nope"),
    NUZZLE("Nuzzle"),
    PANIC("Panic"),
    PAT("Pat"),
    PECK("Peck"),
    POKE("Poke"),
    POUT("Pout"),
    PUNCH("Punch"),
    RUN("Run"),
    SAD("Sad"),
    SHOOT("Shoot"),
    SHRUG("Shrug"),
    SIP("Sip"),
    SLAP("Slap"),
    SLEEPY("Sleepy"),
    SMILE("Smile"),
    SMUG("Smug"),
    STAB("Stab"),
    STARE("Stare"),
    SUICIDE("Suicide"),
    TEASE("Tease"),
    Think("Think"),
    THUMBSUP("Thumbsup"),
    TICKLE("Tickle"),
    TRIGGEERED("Triggered"),
    WAG("Wag"),
    WAVE("Wave"),
    WINK("Wink"),
    YES("Yes");


    private final String nome;

    Emocoes(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public static boolean contemOpcao(String opcao) {

        for (Emocoes emocoes : Emocoes.values()) {
            if (emocoes.getNome().equalsIgnoreCase(opcao.trim().toLowerCase())) {
                return true;
            }
        }
        return false;
    }
}
