package de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.game;

public aspect MethodReport {

    long timeGameplay = 0;
    long timeInteraction = 0;
    
    pointcut reportGameplayMethods() : execution(* Gameplay.*(..));
    pointcut reportInteractionMethods() : execution(* Interaction.*(String));
    
    before() : reportGameplayMethods() {
        timeGameplay = System.currentTimeMillis();
        System.out.println("#  > [ACCESS: "+thisJoinPoint.getSignature().getName()+"]");
    }
    
    after() returning(Object o) : reportGameplayMethods() {
        System.out.println("#  > [LEAVE: "+thisJoinPoint.getSignature().getName()+" RETURN: " + (Boolean)o + " TIME: " + (System.currentTimeMillis() - timeGameplay) +"ms]");
    }
    
    before() : reportInteractionMethods() {
        timeInteraction = System.currentTimeMillis();
        System.out.println("#  > [ACCESS: "+thisJoinPoint.getSignature().getName()+" ARG: \"" + (String)thisJoinPoint.getArgs()[0] + "\"]");
    }
    
    after() : reportInteractionMethods() {
        System.out.println("#  > [LEAVE: " + thisJoinPoint.getSignature().getName() + " TIME: " + (System.currentTimeMillis() - timeInteraction) +"ms]");
    }
    
}
