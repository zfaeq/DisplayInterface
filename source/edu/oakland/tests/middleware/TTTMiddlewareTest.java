package edu.oakland.tests.middleware;

/*
    TTTMiddlewareTest

 */

import edu.oakland.production.middleware.*;
import edu.oakland.production.database.*;
import edu.oakland.tests.middleware.*;
import org.junit.*;
import org.hamcrest.*;
import org.hamcrest.core.*;
import org.hamcrest.internal.*;

public class TTTMiddlewareTest{

    TTTMiddleware middleware;
    TTTDatabase database;

    @Before
    public void init(){
        database = new TTTDatabase();
        middleware = new TTTMiddleware(database);
    }


    @Test
    public void testPlaceMarkOnBoard(){

        MatcherAssert.assertThat(middleware.placeMarkOnBoard('X',0,0), Matchers.is(true));
        MatcherAssert.assertThat(middleware.placeMarkOnBoard('X',0,0), Matchers.is(false));
    }


    @Test
    public void testXWin(){
        middleware.placeMarkOnBoard('X',0,0);
        middleware.placeMarkOnBoard('X',0,1);
        middleware.placeMarkOnBoard('X',0,2);
        MatcherAssert.assertThat(middleware.checkForWinOrDraw(), Matchers.is('X'));
    }

    @Test
    public void testDraw(){
        middleware.placeMarkOnBoard('X',0,0);
        middleware.placeMarkOnBoard('X',0,1);
        middleware.placeMarkOnBoard('O',0,2);
        middleware.placeMarkOnBoard('O',1,0);
        middleware.placeMarkOnBoard('O',1,1);
        middleware.placeMarkOnBoard('X',1,2);
        middleware.placeMarkOnBoard('X',2,0);
        middleware.placeMarkOnBoard('O',2,1);
        middleware.placeMarkOnBoard('X',2,2);
        MatcherAssert.assertThat(middleware.checkForWinOrDraw(), Matchers.is('D'));
    }

    @Test
    public void testContinueGame(){
        middleware.placeMarkOnBoard('X',0,0);
        middleware.placeMarkOnBoard('O',2,0);
        MatcherAssert.assertThat(middleware.checkForWinOrDraw(), Matchers.is('N'));
    }
}
