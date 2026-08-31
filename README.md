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

> **Working on this at home and stuck?** No AI on this one — but there is a chapter, a
> video, and a person for every single exercise. They are listed under
> **[Stuck? Everything you are allowed to use](#stuck-everything-you-are-allowed-to-use)**.
> Go there before you give up, and before you open a model.

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

## Stuck? Everything you are allowed to use

**No AI on this one — but "no AI" does not mean "no help."** It means the help has to be
the kind you learn from. All of this is fair game:

### Read the failure message first

JUnit tells you what it wanted and what it got:

```
expected: <2> but was: <0>
```

`0` is the stub — you have not replaced it yet. Anything else means you wrote something, it
ran, and it produced the wrong answer, which is much better news.

### Write the Python first

The technique that beats everything else on this page. Literally, in a comment above the
method:

```java
// python: return n // 2
public int half(int n) {
    return 0;
}
```

Then translate it one piece at a time. **If the Python is right and the Java is wrong, the
difference between them is the thing this exercise is teaching you.** That is the entire
point of the session, and nothing on the rest of this list gets you there faster.

### Look it up — the exact chapter and video for each exercise

Every link below goes straight to the page or the video. **Nothing here is behind a
paywall and nothing tracks whether you use it.**

| # | Exercise | Read this | Watch this |
|---|---|---|---|
| 1 | Integer division | [Think Java §2.5 — Arithmetic Operators](https://books.trinket.io/thinkjava2/chapter2.html) | [Variables in Java](https://www.youtube.com/watch?v=so1iUWaLmKA) · 12 min |
| 2 | `+` joins vs adds | [Think Java §2.8 — Operators for Strings](https://books.trinket.io/thinkjava2/chapter2.html) | [Variables in Java](https://www.youtube.com/watch?v=so1iUWaLmKA) · 12 min |
| 3 | `char` arithmetic | [Think Java §6.5 — Characters](https://books.trinket.io/thinkjava2/chapter6.html) · [§3.7 — Type Cast Operators](https://books.trinket.io/thinkjava2/chapter3.html) | [Variables in Java](https://www.youtube.com/watch?v=so1iUWaLmKA) · 12 min |
| 4 | `==` vs `.equals()` | **[Think Java §6.10 — String Comparison](https://books.trinket.io/thinkjava2/chapter6.html)** · [§9.1 — Primitives vs Objects](https://books.trinket.io/thinkjava2/chapter9.html) | [Java String methods](https://www.youtube.com/watch?v=P9hEmbfdiuc) |
| 5 | Strings never change | **[Think Java §9.3 — Strings Are Immutable](https://books.trinket.io/thinkjava2/chapter9.html)** | [Useful string methods in Java](https://www.youtube.com/watch?v=Ntl3DxhyrQQ) |
| 6 | Casting chops | **[Think Java §3.7 — Type Cast Operators](https://books.trinket.io/thinkjava2/chapter3.html)** | [Java Math class](https://www.youtube.com/watch?v=w0VTlSOXBs8) · 6 min |
| 7 | `String.format`, `printf` | [Think Java §3.5 — Formatting Output](https://books.trinket.io/thinkjava2/chapter3.html) · [§6.11 — String Formatting](https://books.trinket.io/thinkjava2/chapter6.html) | [Java Math class](https://www.youtube.com/watch?v=w0VTlSOXBs8) · 6 min |
| 8 | `length`, `charAt`, `substring` | [Think Java §6.7–6.9 — Iteration, indexOf, Substrings](https://books.trinket.io/thinkjava2/chapter6.html) | [Java String methods](https://www.youtube.com/watch?v=P9hEmbfdiuc) |

**Two of those are worth reading even if you are not stuck**, because they say the thing
this whole session is about, better than a README can:

- **[§6.10 String Comparison](https://books.trinket.io/thinkjava2/chapter6.html)** opens with
  *"it might be tempting to use the `==` and `!=` operators. But that will almost never
  work."* That is exercise 4, in one sentence.
- **[§9.3 Strings Are Immutable](https://books.trinket.io/thinkjava2/chapter9.html)** walks
  the exact `toUpperCase` example from exercise 5.

> **Note the chapter numbers jump around.** Java-the-book and this-course are ordered
> differently — the book teaches strings inside its loops chapter and immutability four
> chapters later. You are not lost; just read the section, not the chapter.

### Watch — the whole thing, if you prefer video

| | |
|---|---|
| [**Bro Code** — the channel](https://www.youtube.com/@BroCodez) | Free, no signup. Where all of the above live |
| [Java tutorial for beginners](https://www.youtube.com/watch?v=NBIUbTddde4) | Start here if week 1 went by fast |
| [Java Full Course for free](https://www.youtube.com/watch?v=xTtL8E4LzTQ) | The whole language. Chaptered — jump to the part you need |

These are *someone typing Java and running it*, which is exactly the register you want
when you know what to do and not how to say it.

### Ask a person

| | |
|---|---|
| **Tutoring** | You already owe two hours a week and it is **10% of your grade**. Bring this repo. This is the single most under-used resource in the course — you are graded on attending whether or not you bring a question, so bring one |
| **Office hours** | Bring the failing test and what you already tried |
| **Your classmates** | Talk it through, explain it to each other, compare answers. **Type your own code.** If you cannot re-derive it alone afterwards, you have not finished |

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
Thursday's closed-book quiz having learned nothing.

**Everything you *can* use is listed above, under
[Stuck?](#stuck-everything-you-are-allowed-to-use)** — the book by chapter, the videos by
module, tutoring, office hours, and your classmates. Go there before you give up.
