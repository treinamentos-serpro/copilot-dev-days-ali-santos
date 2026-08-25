package com.socops.data;

import java.util.List;

/**
 * Central catalogue of every icebreaker prompt that can appear on a board.
 * Exactly 24 entries — one fewer than the 25-cell grid, because the
 * centre cell is always the free space.
 */
public final class IcebreakerPrompts {

    public static final String FREE_CELL_LABEL = "ESPAÇO LIVRE";

    public static final List<String> ALL_PROMPTS = List.of(
            "costumo levar uma garrafa reutilizável",
            "já plantei uma árvore ou muda",
            "tenho uma rotina de reciclagem em casa",
            "evito desperdício de água no dia a dia",
            "participo ou apoio ações de sustentabilidade local",
            "já usei transporte coletivo ou bicicleta",
            "tenho uma horta ou vaso de plantas",
            "já reduzi o uso de plástico descartável",
            "conheço uma iniciativa ecológica na minha cidade",
            "já comprei produtos locais e de temporada",
            "me preocupo com o consumo consciente",
            "já participei de uma limpeza de rua",
            "tenho um hábito de reutilizar materiais",
            "já conversei com alguém sobre alimentação sustentável",
            "prefiro produtos com menos embalagens",
            "já me conectei com uma comunidade verde",
            "quero aprender mais sobre energia renovável",
            "já usei sacolas ou recipientes reutilizáveis",
            "me inspiro em práticas de baixo impacto",
            "já reduzi o uso de descartáveis no trabalho",
            "costumo separar resíduos corretamente",
            "já participei de uma feira de troca ou doação",
            "tenho um projeto de sustentabilidade pessoal",
            "já aprendi uma dica para viver mais sustentável"
    );

    private IcebreakerPrompts() {
        /* catalogue only — no instances */
    }
}
