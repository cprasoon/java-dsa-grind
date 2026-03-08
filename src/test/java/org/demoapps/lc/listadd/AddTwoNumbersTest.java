package org.demoapps.lc.listadd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class AddTwoNumbersTest {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    AddTwoNumbers addTwoNumbers;

    @BeforeEach
    void setUp() {
        addTwoNumbers = new AddTwoNumbers();
    }

    @Test
    void addTwoNumbers() {

        ListNode l1 = new ListNode(3);
        ListNode l2 = new ListNode(4, l1);
        ListNode l3 = new ListNode(2, l2);

        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(6, l4);
        ListNode l6 = new ListNode(5, l5);
        logger.info("N1" + l3);
        logger.info("N2" + l6);

        ListNode result = addTwoNumbers.addTwoNumbers(l3, l6);
        logger.info("Result" + result.toString());

        Assertions.assertNotNull(result);
        Assertions.assertEquals(7, result.val);
        Assertions.assertEquals(0, result.getNext().val);
        Assertions.assertEquals(8, result.getNext().getNext().val);
    }


    @Test
    void addTwoNumbersZero() {
        ListNode l1 = new ListNode(0);

        ListNode l2 = new ListNode(0);
        logger.info("N1" + l1);
        logger.info("N2" + l2);

        ListNode result = addTwoNumbers.addTwoNumbers(l1, l2);
        logger.info("Result" + result.toString());

        Assertions.assertNotNull(result);
        Assertions.assertEquals(0, result.val);
    }


    @Test
    void addTwoNumbersAssymetric() {

        ListNode l11 = new ListNode(9);
        ListNode l12 = new ListNode(9, l11);
        ListNode l13 = new ListNode(9, l12);
        ListNode l14 = new ListNode(9, l13);
        ListNode l15 = new ListNode(9, l14);
        ListNode l16 = new ListNode(9, l15);
        ListNode l17 = new ListNode(9, l16);

        ListNode l21 = new ListNode(9);
        ListNode l22 = new ListNode(9, l21);
        ListNode l23 = new ListNode(9, l22);
        ListNode l24 = new ListNode(9, l23);

        logger.info("N1" + l17);
        logger.info("N2" + l24);

        ListNode result = addTwoNumbers.addTwoNumbers(l17, l24);
        logger.info("Result" + result.toString());

        Assertions.assertNotNull(result);
        Assertions.assertEquals(8, result.val);
        Assertions.assertEquals(9, result.getNext().val);
        Assertions.assertEquals(9, result.getNext().getNext().val);
        Assertions.assertEquals(9, result.getNext().getNext().getNext().val);
        Assertions.assertEquals(0, result.getNext().getNext().getNext().getNext().val);
        Assertions.assertEquals(0, result.getNext().getNext().getNext().getNext().getNext().val);
        Assertions.assertEquals(0, result.getNext().getNext().getNext().getNext().getNext().getNext().val);
        Assertions.assertEquals(1, result.getNext().getNext().getNext().getNext().getNext().getNext().getNext().val);
    }


}