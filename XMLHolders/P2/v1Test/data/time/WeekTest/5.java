@Test
    public void testW52Y9999Previous() {
        Week previous = (Week) this.w52Y9999.previous();
        assertEquals(this.w51Y9999, previous);
    }

    