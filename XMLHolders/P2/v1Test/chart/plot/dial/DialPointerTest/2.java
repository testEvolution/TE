@Test
    public void testEqualsPointer() {
        DialPointer.Pointer p1 = new DialPointer.Pointer();
        DialPointer.Pointer p2 = new DialPointer.Pointer();
        assertEquals(p1, p2);

        p1.setFillPaint(Color.GREEN);
        assertFalse(p1.equals(p2));
        p2.setFillPaint(Color.GREEN);
        assertTrue(p1.equals(p2));

        p1.setOutlinePaint(Color.GREEN);
        assertFalse(p1.equals(p2));
        p2.setOutlinePaint(Color.GREEN);
        assertTrue(p1.equals(p2));
    }

    