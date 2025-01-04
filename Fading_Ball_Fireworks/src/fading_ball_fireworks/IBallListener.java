/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fading_ball_fireworks;

import java.util.EventListener;

public interface IBallListener extends EventListener{
    void ballFadedOut(FadingBall ball);
}
