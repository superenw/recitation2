# Recitation 2 — Java for Python Programmers

**Week 2 · in section · Tier 0 — no AI**

You already know how to solve every problem in this repo. You have solved all of them
in Python. **Nothing here is a new idea** — the only thing that is new is saying it in
Java, and the handful of places where Java's answer is different from Python's answer.

There are **eight exercises and 42 tests**. Thirty-nine of them are red right now. Turn
them green.

> **Section is fifty minutes and this is more than fifty minutes of work.** That is on
> purpose. Get as far as you get in the room, **push before you leave**, and finish the
> rest by **Sunday Sep 6**. Nobody is expected to go eight-for-eight at the bell.

> **Three tests pass before you write anything.** They are `true`/`false` methods, and
> the stub happens to guess right. A coin flip is not an implementation — write the real
> one anyway.

---

## Before anything else

```
./mvnw test          # macOS / Linux
mvnw.cmd test        # Windows
```

You should see **39 failures**. That is the correct starting state. If you see a
compile error instead, stop and raise your hand — something is wrong with the setup,
not with you.

Then work one class at a time:

```
open the class  →  read the comment  →  write one line  →  ./mvnw test  →  commit
```

Commit after **each exercise you finish**, not once at the end. Eight small commits is
the shape of the history I am looking for.

**Before you leave the room**, whatever you have finished:

```
git push -u origin recitation2
```

then open a pull request. **The pull request is the submission.** Push again as you finish
the rest at home — the PR updates itself, and CI re-runs every time.

**Due Sunday Sep 6, 11:59 PM**, same as the drills.

---

## The eight exercises

Work them in order. They get harder, and the later ones lean on the earlier ones.

| # | File | The Python habit that breaks |
|---|---|---|
| 1 | `IntegerDivision.java` | `5 / 2` is `2` in Java, and `-7 / 2` is `-3`, not `-4` |
| 2 | `Concatenation.java` | `+` means "add" until it means "join", and position decides which |
| 3 | `CharArithmetic.java` | a `char` is a number — `'A' + 1` is `66`, not `'B'` |
| 4 | `StringEquality.java` | `==` compares objects, not text. **The big one** |
| 5 | `Immutability.java` | `s.toUpperCase()` changes nothing unless you keep the answer |
| 6 | `Truncation.java` | `(int) 3.9` is `3` — casting chops, it does not round |
| 7 | `Formatting.java` | `String.format` is the f-string, and it *does* round |
| 8 | `StringBasics.java` | `len(s)` → `s.length()`, and there is no `s[-1]` |

Every file has the examples written into the comment above each method. Read the
comment before you write anything — the answer to "what is this supposed to do" is
always there.

---

## Why these eight

Each one is a place where **your Python instinct produces working Java that computes the
wrong answer.** No compile error, no exception, no red squiggle — just a number that is
quietly off by a bit.

That is the whole reason this session exists. Syntax you get wrong is cheap: the compiler
tells you immediately. Semantics you get wrong is expensive, and Python spent a year
training you into four or five of them.

**These are also exactly what Q1 asks you on Tuesday.** The quiz is on paper, closed
book, and every item on it is one of the eight ideas in this repo. If you finish this
session with 42 green tests you have already studied for it.

Exercises 6, 7 and 8 are the ones **Skill Builder 1** needs. `toHundredths` in exercise 6
is the multiply-cast-divide trick SB1 asks for by name, and `spiceReport` in exercise 7
builds SB1's output sentence exactly.

---

## Stuck?

**Write the Python first.** Literally, in a comment above the method:

```java
// python: return n // 2
public int half(int n) {
    return 0;
}
```

Then translate it one piece at a time. If the Python is right and the Java is wrong, the
difference between them is the thing this exercise is teaching you.

**Read the failure message.** JUnit tells you what it wanted and what it got:

```
expected: <2> but was: <0>
```

`0` is the stub — you have not replaced it yet. Anything else means you wrote something,
it ran, and it produced the wrong number, which is much better news.

---

## If something goes wrong

| Symptom | Fix |
|---|---|
| `./mvnw: Permission denied` | `chmod +x mvnw`, then try again |
| Windows: `./mvnw` does nothing | The command is `mvnw.cmd test`, without the `./` |
| First run takes forever | Normal, once. Maven is downloading |
| `expected: <hel> but was: <null>` | Still returning the stub's `null`. Replace it |
| `incompatible types: possible lossy conversion from int to char` | Exercise 3. Java will not narrow for you — say `(char)` |
| `incompatible types: possible lossy conversion from double to int` | Exercise 6. Same rule, different pair of types |
| Tests pass locally, CI is red | You committed but did not push, or pushed to the wrong branch |

---

## Using AI on this

**Tier 0 — no AI.** These are 42 assertions about how Java behaves, and a model produces
all of them in about four seconds. It would also be the fastest way to arrive at
Tuesday's closed-book quiz having learned nothing.

If you are stuck, the honest route is the one above: write the Python, then translate it.
