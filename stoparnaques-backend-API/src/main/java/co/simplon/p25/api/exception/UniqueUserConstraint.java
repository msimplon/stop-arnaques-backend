package co.simplon.p25.api.exception;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.NotNull;

@Constraint(validatedBy = UniqueUserValidator.class)
@Retention(RUNTIME)
@Target(FIELD)
@NotNull
public @interface UniqueUserConstraint {
    String message() default "User email already used for this Client";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}

//package = le nom qu'on donne a un groupe de fichier pour qu'il soit dans le même "dossier" du package. Le package, en web, utilise le nom du site web à l'envers . (com.facebook, com.google, etc..) (ne me demande pas pourquoi, j'en sais rien)
//import = importer des bibliotheques dans le projet, ou des autres fichiers dont tu as besoin
//@Constraint = donne une contrainte (validatedBy utilisera la classe UniqueEmailValidator
//@Retention(RUNTIME) = je sais pas
//@Target(FIELD) = apparemment ce que tu cibles, là c'est un champs que tu cibles
//public @interface UniqueEmail { = tu créés une interface qui s'appelle UniqueEmail
//String message() default "email_exists"; = une fonction par défault contenant "email_exists"
//Class<?>[] groups() default {} = une classe groups par défault sans type mais donnant un tableau
//Class<? extends Payload>[] payload() default {} = une classe s'appelant payload contentant un tableau de type inconnu étendu avec la classe Payload (elle rajoute ce qui se trouve dans la classe Payload
//} = fin de l'interface
//En gros, une classe va faire appel a cette classe au moment de vérifier l'email
//Elle va aussi integrer payload (qui vérifie si t'as un token d'identification valide) . P-e pour le changement d'email quand tu es déjà connecté.