@Test
    public void testQ4Y9999Previous() {
        Quarter previous = (Quarter) this.q4Y9999.previous();
        assertEquals(this.q3Y9999, previous);
    }

    