@Test
    public void testW1Y1900Next() {
        Week next = (Week) this.w1Y1900.next();
        assertEquals(this.w2Y1900, next);
    }

    