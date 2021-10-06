@Test
    public void testJan1900Next() {
        Month next = (Month) this.jan1900.next();
        assertEquals(this.feb1900, next);
    }

    