package com.udemy.spring3item.exception;

/**
 * この例外が具体的に発生した場合、Controllerクラスで、
 * こちらのExceptionをハンドリングしてあげて、
 * アクセス側に、レスポンスとして例外のメッセージを渡すようにする
 * 
 * ->そのために、ControllerAdviceというアノテーションを付与したクラスを定義しておく
 * ->Controllerクラス全体共通としてハンドルして、自動でレスポンスとして返してくれる
 */

public class ItemNotFoundException extends RuntimeException {
	
	// RuntimeExceptionはThrowableクラスを継承しているので、
	// serialVersionUID を定義する必要がある（お作法）
	private static final long serialVersionUID = 1L;
	
	public ItemNotFoundException(Long itemId) {
		super("商品コード:" + itemId + "は見つかりません。");
	}
	
}
