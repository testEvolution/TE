@Test
    public void testDec9999Previous() {
        Month previous = (Month) this.dec9999.previous();
        assertEquals(this.nov9999, previous);
    }

    