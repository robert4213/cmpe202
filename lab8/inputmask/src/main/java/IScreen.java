/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public interface IScreen
{

    void key(String ch) ; 	// send key entry events to screen 
    String display() ;      		// displays screen components
    String name() ;         		// returns name of screen
    void delete();
}
