@Test
    public void testJan1900Previous() {
        Month previous = (Month) this.jan1900.previous();
        assertNull(previous);
    }

    