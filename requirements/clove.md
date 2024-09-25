# Instructors

## Team Introduction
Young people who love the C language

- Team Leader
    - Seok Minjun
    Role: Team management and overall Git repository management
- Team member
  - Seo Dongjun
    Role: Achievement conditions description
  - Song Woojin
    Role: Enter player records into a file and manage scores or achievements
  - Ryu Jemu
    Role: Responsible for calculating game scores based on factors such as bullets, play-tiem, etc.
  - Han Junhyeok
    Role: Management of saving and tracking in the achievement system
  - Han Ryunheon
    Role: Managing game score and develop rank system
  
## Team Requirements
  Recordkeeping and achievement system
- Instruct
  Overall management of challenges achieved and scores earned during gameplay

## Detailed Requirements
  1. Score Calculation: Management of scores earned through gameplay
  2. Score Ranking: Rankings based on calculated scores
  3. Achievements: Challenges that can be achieved through specific actions during gameplay
  4. Save System: Management of scores and achievement progress
  5. Hidden Achievements: Additional challenges unlocked after completing specific achievements

## Dependency
  1. Function triggered when an achievement is acquired (OnAchievementAcquire)
    Visual effects
    Sound effects
    Currency reward
  2. Function triggered after score calculation (OnScoreCalculated)
    Visual effects
    Sound effects
    Currency reward
  3. Score calculation method based on level or two-player mode